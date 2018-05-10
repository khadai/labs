import re


def search():
    images = 0

    file = open('apache_logs')
    for line in file:
        if re.search(
                '(((05:[0-4][0-9])|(05:5[0-5]))|((03:0[5-9])|(03:[1-5][0-9]))|(04:[0-5][0-9]))'
                '.*\w*GET.*\w*\.((gif)|(jpeg)|(png)|(jpg)).*\w*200',
                str(line)):
            images += 1
    print(images)
    file.close()


if __name__ == "__main__":
    search()

# (((05:[0-4][0-9])|(05:5[0-5]))|((03:0[5-9])|(03:[1-5][0-9]))|(04:[0-5][0-9]))
# ((03:0[5-9])|(03:[1-5][0-9]))
# (04:[0-5][0-9])
# ((05:[0-4][0-9])|(05:5[0-5]))
