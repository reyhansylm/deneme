import sqlite3

def create_table():
    conn=sqlite3.connect("information.db")
    cursor=conn.cursor()

    cursor.execute("CREATE TABLE IF NOT EXISTS students(id integer PRIMARY KEY, name TEXT, lastname TEXT, username TXT, password TEXT )" )
    conn.commit()
    conn.close()

def insert(name,lastname,username,password):
    conn=sqlite3.connect("information.db")
    cursor = conn.cursor()
    add_command= "INSERT INTO students(name, lastname, username, password) VALUES {}"
    data=(name,lastname,username,password)

    cursor.execute(add_command.format(data))
    conn.commit()
    conn.close()


def search(username):
    conn = sqlite3.connect("information.db")
    cursor = conn.cursor()

    srch="SELECT * from students WHERE username='{}' "
    cursor.execute(srch.format(username))

    user=cursor.fetchone()

    conn.close()
    return user

def print_all():
    conn = sqlite3.connect("information.db")
    cursor = conn.cursor()

    cursor.execute("SELECT * from students")
    list_all=cursor.fetchall()

    for i in list_all:
        print(i)

    conn.close()

def update_password(username,newpassword):
    conn = sqlite3.connect("information.db")
    cursor = conn.cursor()

    upd="UPDATE students SET password= '{}' WHERE username= '{}' "

    cursor.execute(upd.format(newpassword,username))

    conn.commit()
    conn.close()
#
# def delete_account(username):
#     conn = sqlite3.connect("information.db")
#     cursor = conn.cursor()
#
#     dlt="DELETE from students WHERE username= '{}' "
#     cursor.execute(dlt.format(username))
#     conn.commit()
#     conn.close()



