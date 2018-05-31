from flask import Flask, jsonify, abort, make_response, request
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+pymysql://khadai:00gucci2345@localhost:3306/iot-test-db'
db = SQLAlchemy(app)


class Drink(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(30))
    type = db.Column(db.String(30))
    capacity = db.Column(db.Integer)
    taste = db.Column(db.String(30))


@app.route('/drinks', methods=['GET'])
def get_all_drinks():
    drinks = []
    all_drinks = Drink.query.all()  # query - запит на дані
    for d1 in all_drinks:
        drink = {
            'name': d1.name,
            'type': d1.type,
            'capacity': d1.capacity,
            'taste': d1.taste
        }
        drinks.append(drink)
    db.session.commit()
    return jsonify({'drinks': drinks})


@app.route('/drinks/<int:drink_id>', methods=['GET'])
def get_drink(drink_id):
    d1 = Drink.query.filter_by(id=drink_id).first()
    drink = {
        'name': d1.name,
        'type': d1.type,
        'capacity': d1.capacity,
        'taste': d1.taste
    }
    db.session.commit()
    return jsonify({'drink': drink})


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not fou nd'}), 404)


@app.route('/drinks/<int:drink_id>', methods=['PUT'])
def update_drink(drink_id):
    drink = Drink.query.get(drink_id)

    drink.name = request.json['name']
    drink.type = request.json['type']
    drink.capacity = request.json.get('capacity', drink.capacity)
    drink.taste = request.json.get('taste', drink.taste)
    db.session.commit()
    return jsonify('Successful')


@app.route('/drinks', methods=['POST'])
def add_drink():
    print(request.json)
    if not request.json or not 'name' in request.json:
        abort(400)  #
    new_drink = Drink()
    new_drink.id = request.json['id']
    new_drink.name = request.json['name']
    new_drink.type = request.json.get('type', "")
    new_drink.capacity = request.json.get('capacity', 0)
    new_drink.taste = request.json.get('taste', "")

    db.session.add(new_drink)
    db.session.commit()
    return jsonify('Successful')


@app.route('/drinks/<int:drink_id>', methods=['DELETE'])
def delete_drink(drink_id):
    d1 = Drink.query.filter_by(id=drink_id).first()
    db.session.delete(d1)
    db.session.commit()
    return jsonify({'result': True})


if __name__ == '__main__':
    app.run(debug=True)
