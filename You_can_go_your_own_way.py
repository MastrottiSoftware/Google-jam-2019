t = int(input(""))
input_value = []

for i in range(0, t):
    input_value.insert(len(input_value), input()+" "+input())

for i in range(0, len(input_value)):
    action = input_value[i].split(" ")
    string = ""
    for j in range(0, len(action[1])):
        if action[1].__getitem__(j) == "S":
            string += "E"
        else:
            string += "S"

    print("Case #"+str(i+1)+": " + string)
