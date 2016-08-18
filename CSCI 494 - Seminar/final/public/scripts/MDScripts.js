//Private Methods


var gmwa = [];
var gmna = [];
var gdwa = [];
var gdna = [];

function MWGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt();
		var ans = ran1 * ran2;
		var genMWord= ["If tiles on the floor in the hallway are installed in "+ran1+" rows with "+ran2+" tiles in each row, how many tiles are there all together?",
						 "Luke planted "+ran1+" carnations. Piper planted "+ran2+" times as many carnations. How many carnations did Piper plant?",
						 "Bill wrote "+ran1+" short stories in each notebook. If there were "+ran2+" notebooks, how many short stories were there all together?",
						 "On the bookshelf, there are "+ran1+" books in each row and there are "+ran2+" rows. How many books are there all together?",
						 "There are "+ran1+" piles of laundry with "+ran2+" socks in each pile. How many socks are there all together?",
						 "If bulldogs in the dog show are sitting in "+ran1+" rows with "+ran2+" bulldogs in each row, how many bulldogs are there all together?",
						 "If mangos on the table at the fruit stand are lined up in "+ran1+" rows with "+ran2+" mangos in each row, how many mangos are there all together?",
						 "If hammers at the home improvement store are organized in "+ran1+" rows with "+ran2+" hammers in each row, how many hammers are there all together?",
						 "If "+ran1+" logs  fit in a willbarrow and I make "+ran2+" trips. How many logs is that?",
						 "Jake planted "+ran1+" tulips in each planter box. If there were "+ran2+" planter boxes, how many tulips were there all together?",
						 "Lynn wrote "+ran1+" poems. Trey wrote "+ran2+" times as many poems. How many poems did Trey write?",
						 "There are "+ran1+" fourth graders on the square table and "+ran2+" times that many on the round table. How many fourth graders are on the round table?"];
						 
		var text = genMWord[Math.floor(Math.random()*12)];
		var temp = document.getElementById("mw"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("mwa"+i);
		temp2.innerHTML = "";
		gmwa[i-1] = ans;
		document.getElementById("mwi"+i).value = "";
	}
}
function MNGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt();
		var ans = ran1 * ran2;
		var text = ran1+"*"+ran2+"=?";		
		var temp = document.getElementById("mn"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("mna"+i);
		temp2.innerHTML = "";
		gmna[i-1] = ans;
		document.getElementById("mni"+i).value = "";
	}
}
function DWGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt2(ran1);
		var ans = +((ran1/ran2).toFixed(2));
		var genDWord= ["If "+ran1+" pumpkins in the garden are growing with "+ran2+" pumpkins in each row, how many rows are there?",
						"Each group in the gym has "+ran2+" students. If there are "+ran1+" students all together, how many groups are there?",
						"Nina had "+ran1+" sea shells. If she placed "+ran2+" sea shells in each pile, how many piles were there?",
						"Shane gathered "+ran2+" sticks. Sloan gathered "+ran1+" sticks. Sloan gathered how many times as many sticks as Shane?",
						"The "+ran2+" groups in the gym have "+ran1+" kids all together. How many kids are in each group?",
						"If "+ran1+" building blocks on the playroom floor are lined up carefully with "+ran2+" building blocks in each row, how many rows are there?",
						"Each tree along the river has "+ran2+" robins. If there are "+ran1+" robins all together, how many trees are there?",
						"Paige gathered "+ran2+" pine cones. Jason gathered "+ran1+" pine cones. Jason gathered how many times as many pine cones as Paige?",
						"The "+ran2+" trees along the river have "+ran1+" robins all together. How many robins are in each tree?",
						"If "+ran1+" desks in the auditorium are lined up quietly in "+ran2+" rows, how many desks are in each row?",
						"Each parking lot at the mall has "+ran2+" vehicles. If there are "+ran1+" vehicles all together, how many parking lots are there?",
						"On the bookshelf, there are "+ran2+" magazines in each row and "+ran1+" magazines all together. How many rows are there?"];
						 
		var text = genDWord[Math.floor(Math.random()*12)];
		var temp = document.getElementById("dw"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("dwa"+i);
		temp2.innerHTML = "";
		gdwa[i-1]= ans;
		document.getElementById("dwi"+i).value = "";
	}
}
function DNGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt2(ran1);
		var ans = +((ran1/ran2).toFixed(2));
		var text = ran1+"/"+ran2+"=?";		
		var temp = document.getElementById("dn"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("dna"+i);
		temp2.innerHTML = "";
		gdna[i-1] = ans;
		document.getElementById("dni"+i).value = "";
	}
}

function MWEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("mwi"+i).value;
		var temp2 = document.getElementById("mwa"+i);
		if(gmwa[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function MNEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("mni"+i).value;
		var temp2 = document.getElementById("mna"+i);
		if(gmna[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function DWEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("dwi"+i).value;
		var temp2 = document.getElementById("dwa"+i);
		if(gdwa[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function DNEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("dni"+i).value;
		var temp2 = document.getElementById("dna"+i);
		if(gdna[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function getRandomInt(){
	return Math.floor(Math.random()*99) +1;
}
function getRandomInt2(temp){
	return Math.floor(Math.random() * temp) + 1
}