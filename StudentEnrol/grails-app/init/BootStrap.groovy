import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->

def leader1=new Leader(fullName:'Dr Anne Roberts',
			post:'Senior Lecturer',
			subject:'Animation',
			email:'a.d.roberts@theUni.ac.uk',
			office:'Room 1234',
			bio:'''lorem ipsum dolor sit amet, an ullum epicurei definitionem''').save()	


def course1=new Course(title: 'Interactive Media with Animation',
			department:'Computing',
			description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensbus, te ummo senserit vix, mel reque corpora vulputate ei.''',
			leader:leader1,
			code:'IMA101',
			startDate:new Date('19/01/2015'),
			endDate:new Date('19/01/2020')).save()

	

def module1=new Module(title:'Web Architectures',
			code:'WA234',
			credits:5,
			lecturer:'Dr Steve Crossbar',
			description:'''Lorem ipsum dolor sit amet, ludus contentiones ut nam, quaeque dolores facilisi in nec''').save()



def lect1=new Lecturer (name:'Dr Steve Crossbar',
			post:'Lecturer',
			email:'s.h.crossbar@theUni.ac.uk',
			department:'Computing',
			subject:'Web Design',
			research: 'knowledge management').save()



def student1=new Student(name: 'Jane Armando',
			studentid:'b38845',
			dob:new Date('10/11/1996'),
			email:'kst@email.com',
			username:'rvg96',
			password:'secret',
			course:'Web Systems Design').save()

    }
    def destroy = {
    }
}
