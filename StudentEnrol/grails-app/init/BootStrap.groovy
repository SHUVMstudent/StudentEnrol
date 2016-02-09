import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->

	def cours1=new Course(title: 'Interactive Media with Animation',
			department:'Computing',
			description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensbus, te ummo senserit vix, mel reque corpora vulputate ei.''',
			leader:'Joe Jojo',
			code:'IMA101',
			startDate:new Date('19/01/2015'),
			endDate:new Date('19/01/2020')).save()

	def leader1=new Leader(fullName:'Dr Anne Roberts',
			post:'Senior Lecturer',
			subject:'Animation',
			email:'a.d.roberts@theUni.ac.uk',
			office:'Room 1234',
			bio:'''lorem ipsum dolor sit amet, an ullum epicurei definitionem''').save()

	def module1=new Module(title:'Web Architectures',
			code:'WA234',
			credits:5,
			lecturer:'Dr Steve Crossbar',
			description:'''Lorem ipsum dolor sit amet, ludus contentiones ut nam, quaeque dolores facilisi in nec''').save()
    }
    def destroy = {
    }
}
