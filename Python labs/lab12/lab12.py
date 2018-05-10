import re


def search():
    images = 0

    file = open('apache_logs')
    for line in file:
        if re.search('[3:[0[6-9]]] | [1-5][0-9] ]] | [4:[0-5][0-9]] | [5:[ [0-4][0-9] | 5[0-5] ]]'
                     '.*\w*GET.*\w*\.((gif)|(jpeg)|(png)|(jpg)).*\w* 200', str(line)):
            images += 1
    print(images)
    file.close()


if __name__ == "__main__":
    search()
# (3:[0[6-9]]] | [1-5][0-9] ]] | [4:[0-5][0-9]] | [5:[ [0-4][0-9] | 5[0-5] ]) # 74
#
