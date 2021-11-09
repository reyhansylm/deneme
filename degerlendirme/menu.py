from student import *

def print_menu():

    print("""
    
    1-LOGIN
    2-REGISTER
    3-CLOSE
    """)

create_table()

while True:
    print_menu()
    choise=input("Choise: ")

    if choise == "1":
        username=input("Username: ")
        pasword=input("Password: ")
        src= search(username)
        if src==None:
            print("USER NOT FOUND")
            continue


    if choise == "2":
        name = input("Name: ")
        lastname=input("Lastname: ")
        username = input("Username: ")
        pasword = input("Password: ")
        src = search(username)
        if src != None:
            print("Account With This Username")
            continue
        else:
            insert(name,lastname,username,pasword)
            print("Record Created")

    if choise == "3":
        break
