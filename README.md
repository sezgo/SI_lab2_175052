
### Втора лабораториска вежба по Софтверско инженерство
---
## Сезѓин Мустафа, бр. на индекс 175052
---
# Група на код:  
Ја добив групата на код 4

# Control Flow Graph:  

![my graph](sezgoCFD.png)  

# Цикломатска комплексност  

Цикломатската комплексност на овој код е 8.  
предикатни јазли: 7  
па 7 + 1 = 8.  
исто како:  
edges - nodes + 2P  
каде  
P = 1,  
edges = 29,  
nodes = 23.  

29 - 23  + 2 = 8.  


# Тест случаи според критериумот Every statement  
user = null goes through 1-2-3--19-20  
and  
User user = new User(sezgo, my$passworD1, mymail@mail.com)  
goes through every statement except 19 which was covered with the first test case.  

....  
# Тест случаи според критериумот Every path  
In order to cover all branches we need 5 test cases: an uninitialized user, an user that's initialized with null username, password and mail, a user with a password that has digit, upper case letter and special character in it, a user with a password that has upper case letter and special character but no digits in it, a user with a password that has digits but no upper case and no special character in it.

![table for everybranc](every-branch-table.png) 

....  
# Објаснување на напишаните unit tests  
... ...  
