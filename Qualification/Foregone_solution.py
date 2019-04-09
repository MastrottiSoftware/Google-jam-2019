def find_pair(value):
    value_str = str(value)
    stringa = ""
    for j in range(0, len(value_str)):
        if value_str[j] == "4":
            stringa += "1"
        else:
            stringa += "0"

    value1 = int(stringa)
    value2 = value-value1
    response = str(value1) + " " + str(value2)
    return response


t = int(input(""))
input_value = []
for i in range(0, t):
    input_value.insert(len(input_value), int(input()))

for i in range(0, t):
    print("Case #" + str(i+1)+": "+find_pair(input_value[i]))



