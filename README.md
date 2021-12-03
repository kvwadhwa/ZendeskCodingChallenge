# ZendeskCodingChallenge

## Running Program
Step 0: Install Maven using https://maven.apache.org/install.html

Step 1: Clone package and run locally
```
git clone https://github.com/kvwadhwa/ZendeskCodingChallenge.git
cd ZendeskCodingChallenge
mvn compile
mvn package
mvn install assembly:assembly

java -cp target/ZendeskCodingChallenge-1.0-SNAPSHOT-jar-with-dependencies.jar com.zendesk.kunal.Main
```

## Sample output
```
130 % java -cp target/ZendeskCodingChallenge-1.0-SNAPSHOT-jar-with-dependencies.jar com.zendesk.kunal.Main
Enter your Zendesk URL:
HIDDEN
Enter your Username (Email):
HIDDEN
Enter your Password:
HIDDEN


Menu
Choice 1: View all tickets.
Choice 2: View specific ticket.
Choice 3: Exit.
Please select an option and hit ENTER: 2
Enter valid Ticket ID: 1
Ticket ID: 1; Creation time: Fri Dec 03 00:08:05 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: Sample ticket: Meet the ticket
=== Description BEGINS ===
Hi there,

I’m sending an email because I’m having a problem setting up your new product. Can you help me troubleshoot?

Thanks,
 The Customer


=== Description ENDS ===



Menu
Choice 1: View all tickets.
Choice 2: View specific ticket.
Choice 3: Exit.
Please select an option and hit ENTER: 1
Ticket ID: 1; Creation time: Fri Dec 03 00:08:05 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: Sample ticket: Meet the ticket

Ticket ID: 2; Creation time: Fri Dec 03 00:35:27 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: velit eiusmod reprehenderit officia cupidatat

Ticket ID: 3; Creation time: Fri Dec 03 00:35:27 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: excepteur laborum ex occaecat Lorem

Ticket ID: 4; Creation time: Fri Dec 03 00:35:28 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: ad sunt qui aute ullamco

Ticket ID: 5; Creation time: Fri Dec 03 00:35:28 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: aliquip mollit quis laborum incididunt

Ticket ID: 6; Creation time: Fri Dec 03 00:35:29 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: nisi aliquip ipsum nostrud amet

Ticket ID: 7; Creation time: Fri Dec 03 00:35:29 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: cillum quis nostrud labore amet

Ticket ID: 8; Creation time: Fri Dec 03 00:35:29 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: proident est nisi non irure

Ticket ID: 9; Creation time: Fri Dec 03 00:35:30 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: veniam ea eu minim aute

Ticket ID: 10; Creation time: Fri Dec 03 00:35:30 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: magna reprehenderit nisi est cillum

Ticket ID: 11; Creation time: Fri Dec 03 00:35:31 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: quis veniam ad sunt non

Ticket ID: 12; Creation time: Fri Dec 03 00:35:31 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: tempor aliquip sint dolore incididunt

Ticket ID: 13; Creation time: Fri Dec 03 00:35:31 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: labore pariatur ut laboris laboris

Ticket ID: 14; Creation time: Fri Dec 03 00:35:32 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: officia mollit aliqua eu nostrud

Ticket ID: 15; Creation time: Fri Dec 03 00:35:32 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: do incididunt incididunt quis anim

Ticket ID: 16; Creation time: Fri Dec 03 00:35:33 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: tempor magna anim ea id

Ticket ID: 17; Creation time: Fri Dec 03 00:35:33 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: exercitation sit incididunt magna laboris

Ticket ID: 18; Creation time: Fri Dec 03 00:35:33 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: laborum ea ut in cupidatat

Ticket ID: 19; Creation time: Fri Dec 03 00:35:34 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: est fugiat labore pariatur esse

Ticket ID: 20; Creation time: Fri Dec 03 00:35:34 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: commodo sint laboris est et

Ticket ID: 21; Creation time: Fri Dec 03 00:35:35 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: laboris sint Lorem ex Lorem

Ticket ID: 22; Creation time: Fri Dec 03 00:35:35 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: esse adipisicing consectetur sunt tempor

Ticket ID: 23; Creation time: Fri Dec 03 00:35:35 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: sunt enim pariatur id id

Ticket ID: 24; Creation time: Fri Dec 03 00:35:36 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: et ad ut enim labore

Ticket ID: 25; Creation time: Fri Dec 03 00:35:36 PST 2021; Requested by: null; Assigned to: 1902459016404
	Subject: voluptate dolor deserunt ea deserunt
	
Hit ENTER to continue.
```