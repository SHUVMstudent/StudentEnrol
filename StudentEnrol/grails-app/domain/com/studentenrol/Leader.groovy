package com.studentenrol

class Leader {
	String fullName
	String Post
	String subject
	String email
	String office
	String bio

String toString(){"fullName, office"}

    static constraints = {

	fullName()
	post()
	subject()
	email()
	office()
	bio maxSize:5000
    }
}
