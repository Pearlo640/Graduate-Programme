def register(name, password):
    file = open('Users.txt', 'a')
    file.write('\n' + name + ', ' + password)
    print("Registered")
    file.close()

def login(name, password):
    with open('Users.txt', 'r') as file:
        if name and password in file.read():
            print("Welcome back " + name + " you are logged in")
        else:
            print("Wrong name or password")
    file.close()

def system(choice):
    if choice == 'register':
        print("Welcome new user")
        name = input("Enter your name")
        password = input("Enter your password")
        register(name, password)
    else:
        name = input("Enter your name")
        password = input("Enter your password")
        login(name, password)

def menu():
    global choice
    choice = input("login or register")
    if choice != 'login' and choice != 'register':
        print("Please try again")
        menu()


menu()
system(choice)
