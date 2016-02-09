package com.studentenrol

class Lecturer {
String name
String post
String email
String department
String subject
String research

String toString(){"$name,$email"}

    static constraints = {
name()
post()
email()
department()
subject()
research()
    }
}
