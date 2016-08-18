//Private Methods

var gawa = [];
var gana = [];
var gswa = [];
var gsna = [];

function AWGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt();
		var ans = ran1 + ran2;
		var genAWord= ["Sally has "+ran1+" apples then she buys "+ran2+" more. How many does she have now?",
						 "Timmy has "+ran1+" toy soldiers. "+ran2+" join. How many are there now?",
						 "Susy has "+ran1+" stickers. The teacher gave her "+ran2+" more. How many does she have?",
						 "There were "+ran1+" quarters in the piggy bank. "+ran2+" were added. How many are there now?",
						 "There were "+ran1+" pigeons in a tree. "+ran2+" joined them. How many are there now?",
						 "There are "+ran1+" cows on the farm. "+ran2+" were added. How many are there now?",
						 "Lynn had "+ran1+" pencils. Bob gave her "+ran2+" more. How many does she have now?",
						 "Max had "+ran1+" sticks. Liz gave him "+ran2+" more. How many sticks does Max have now?",
						 "Al had "+ran1+" ribbons. Ryan gave him "+ran2+" more. How many ribbons does Al have now?",
						 "There were "+ran1+" ants in the garden. "+ran2+" more ants crawled in. How many ants are in the garden now?",
						 "There were "+ran1+" dimes in the jar. "+ran2+" more dimes were put in. How many dimes are in the jar now?",
						 "Emma had "+ran1+" jelly beans. George gave her "+ran2+" more. How many jelly beans does Emma have now?"];
						 
		var text = genAWord[Math.floor(Math.random()*12)];
		var temp = document.getElementById("aw"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("awa"+i);
		temp2.innerHTML = "";
		gawa[i-1] = ans;
		document.getElementById("awi"+i).value = "";
	}
}
function ANGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt();
		var ans = ran1 + ran2;
		var text = ran1+"+"+ran2+"=?";		
		var temp = document.getElementById("an"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("ana"+i);
		temp2.innerHTML = "";
		gana[i-1] = ans;
		document.getElementById("ani"+i).value = "";
	}
}
function SWGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt2(ran1);
		var ans = ran1-ran2;
		var genSWord= ["There were "+ran1+" salmon in the pond. "+ran2+" of them swam away. How many salmon are left in the pond?",
						"David had "+ran1+" candies. He gave "+ran2+" of them to Jess. How many candies does David have left?",
						"Luke had "+ran1+" pencils. He gave "+ran2+" of them to May. How many pencils does Luke have left?",
						"There were "+ran1+" sheep on the ranch. "+ran2+" of them were taken away. How many sheep are left on the ranch?",
						"There were "+ran1+" peppers in the garden. "+ran2+" of them were harvested. How many peppers are left in the garden?",
						"There were "+ran1+" quarters in the piggy bank. "+ran2+" of them were taken out. How many quarters are left in the piggy bank?",
						"Kim had "+ran1+" sticks. She gave "+ran2+" of them to Emma. How many sticks does Kim have left?",
						"Levi had "+ran1+" stickers. He gave "+ran2+" of them to Mark. How many stickers does Levi have left?",
						"There were "+ran1+" doves in the tree. "+ran2+" of them flew away. How many doves are left in the tree?",
						"Trent had "+ran1+" action figures. He gave "+ran2+" of them to Jean. How many action figures does Trent have left?",
						"There were "+ran1+" sharks near the shore. "+ran2+" of them swam away. How many sharks are left near the shore?",
						"There were "+ran1+" elephants in the zoo. "+ran2+" of them went away. How many elephants are left in the zoo?"];
						 
		var text = genSWord[Math.floor(Math.random()*12)];
		var temp = document.getElementById("sw"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("swa"+i);
		temp2.innerHTML = "";
		gswa[i-1]= ans;
		document.getElementById("swi"+i).value = "";
	}
}
function SNGenerate(){
	for (var i = 1; i < 7; i++){
		var ran1 = getRandomInt();
		var ran2 = getRandomInt2(ran1);
		var ans = ran1-ran2;
		var text = ran1+"-"+ran2+"=?";		
		var temp = document.getElementById("sn"+i);
		temp.innerHTML = text;
		var temp2 = document.getElementById("sna"+i);
		temp2.innerHTML = "";
		gsna[i-1] = ans;
		document.getElementById("sni"+i).value = "";
	}
}

function AWEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("awi"+i).value;
		var temp2 = document.getElementById("awa"+i);
		if(gawa[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function ANEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("ani"+i).value;
		var temp2 = document.getElementById("ana"+i);
		if(gana[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function SWEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("swi"+i).value;
		var temp2 = document.getElementById("swa"+i);
		if(gswa[i-1] == temp)
			temp2.innerHTML = "correct";
		else
			temp2.innerHTML = "incorrect";
	}
}
function SNEval(){
	for (var i = 1; i < 7; i++){
		var temp = document.getElementById("sni"+i).value;
		var temp2 = document.getElementById("sna"+i);
		if(gsna[i-1] == temp)
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