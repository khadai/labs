from flask import Flask, abort
from flask_restful import Api, Resource, reqparse, fields, marshal

app = Flask(__name__, static_url_path="")
api = Api(app)

drinks = [{'id': 0, 'name': 'Water', 'capacity': 250}]
drink_fields = {'id': fields.Integer, 'name': fields.String, 'capacity': fields.Integer}


class DrinkList(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()  # необхідна функція для обробки вмісту JSON
        self.reqparse.add_argument('id', type=int, required=True, help='No Id provided',
                                   location='json')  # Required – визначає, чи обов’язковим є певним елемент
        self.reqparse.add_argument('name', type=str, default="Water", location='json')
        self.reqparse.add_argument('capacity', type=int, default=250, location='json')
        super(DrinkList, self).__init__()

    @staticmethod
    def get():
        return {'All drinks available': [marshal(drink, drink_fields) for drink in drinks]}

    @app.route('/drinks')
    def put(self):
        args = self.reqparse.parse_args()
        drink = {
            'Id': drinks[-1]['Id'] + 1,
            'id': args['id'],
            'name': args['name'],
            'capacity': args['manufacturer']
        }
        drinks.append(drink)
        return {'Drink': marshal(drink, drink_fields)}, 201

    @app.route('/drinks')
    def post(self):
        args = self.reqparse.parse_args()
        drink = [drink for drink in drinks if drink.get('id') == args['id']]
        if len(drink) == 0:
            abort(404)
        drink = drink[0]
        args = self.reqparse.parse_args()
        for k, v in args.items():
            if v is not None:
                drink[k] = v
        return {'Drink': marshal(drink, drink_fields)}


class Drink(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()  # необхідна функція для обробки вмісту JSON
        self.reqparse.add_argument('id', type=int, required=True, help='No Id provided',
                                   location='json')  # Required – визначає, чи обов’язковим є певним елемент
        self.reqparse.add_argument('name', type=str, default="Water", location='json')
        self.reqparse.add_argument('capacity', type=int, default=250, location='json')
        super(Drink, self).__init__()

    @app.route('/drinks/<int:id>')
    def get(self, id):
        drink = [drink for drink in drinks if drink.get('id') == id]
        if len(drink) == 0:
            abort(404)
        return {'Good': marshal(drink[0], drink_fields)}

    @app.route('/drinks/<int:id>')
    def delete(self, id):
        drink = [drink for drink in drinks if drink.get('id') == id]
        if len(drink) == 0:
            abort(404)
        drinks.remove(drink[0])
        return {'result': True}


api.add_resource(DrinkList, '/drinks', endpoint='goods')
api.add_resource(Drink, '/drinks/<int:id>', endpoint='good')

if __name__ == '__main__':
    app.run(debug=True)
