import string

list_alphabet = list(string.ascii_uppercase)
t = int(input(""))
input_value = []

for i in range(0, t):
    input_value.insert(len(input_value), input()+" "+input())
    input_splited = input_value[i].split(" ")
    N = input_splited[0]
    L = input_splited[1]
    allowed_prime = []
    for num in range(2, int(N) + 1):
        if all(num % i != 0 for i in range(2, num)):
            allowed_prime.insert(len(allowed_prime), num)

    chosen_prime = []
    possibili_coppie = []
    tup = ()
    for j in range(0, int(L)):
        for k in range(0, len(allowed_prime)):
            if (int(input_splited[2+j])/allowed_prime[k]) in allowed_prime:
                chosen_prime.insert(len(chosen_prime), int(allowed_prime[k]))
                chosen_prime.insert(len(chosen_prime), int(int(input_splited[2+j])/allowed_prime[k]))
                tup = (int(allowed_prime[k]), int(int(input_splited[2+j])/allowed_prime[k]))
                possibili_coppie.insert(len(possibili_coppie), tup)
                break

    chosen_prime = list(set(chosen_prime))
    chosen_prime.sort()

    dictionary = {}
    for j in range(0, len(list_alphabet)):
        dictionary[chosen_prime[j]] = list_alphabet[j]

    response_list = []
    way = 0
    for z in range(0, len(possibili_coppie) - 1):
        if way == 0:
            if possibili_coppie.__getitem__(z).__getitem__(1) == possibili_coppie.__getitem__(z + 1).__getitem__(0):
                way = 0
            else:
                way = 1
            response_list.insert(len(response_list), possibili_coppie.__getitem__(z).__getitem__(0))
        else:
            if possibili_coppie.__getitem__(z).__getitem__(0) == possibili_coppie.__getitem__(z + 1).__getitem__(0):
                way = 0
            else:
                way = 1
            response_list.insert(len(response_list), possibili_coppie.__getitem__(z).__getitem__(1))

    response = ""
    for z in range(0, len(response_list)):
        response += dictionary[response_list[z]]
    if int(input_splited[len(input_splited)-1])/possibili_coppie.__getitem__(len(possibili_coppie)-1).__getitem__(0) in chosen_prime:
        response += dictionary[possibili_coppie.__getitem__(len(possibili_coppie)-1).__getitem__(0)]
        response += dictionary[possibili_coppie.__getitem__(len(possibili_coppie)-1).__getitem__(1)]
    else:
        response += dictionary[possibili_coppie.__getitem__(len(possibili_coppie) - 1).__getitem__(1)]
        response += dictionary[possibili_coppie.__getitem__(len(possibili_coppie) - 1).__getitem__(2)]
    print("Case #" + str(i + 1) + ": " + response)
