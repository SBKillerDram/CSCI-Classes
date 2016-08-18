import random    #imports random generator needed for RandomBot
rounds = 5    #setrs the limit of the number of rounds played
currMove = 0    #keeps track of which move is curently on so that iterative bot can play accordingly
p1Moves = [None] * 5    #an array to keep track of player 1 moves
p2Moves = [None] * 5    #an array to keep track of player 2 moves
ties = 0    #counts the number of ties
p1Wins = 0    #counts the number of player 1 wins
p2Wins = 0    #oounts the number of player 2 wins
p1 = None
p2 = None
isP1Mybot = False    #this is used for mybot to determine if player 1 has choosen it or not

class Element:    #superclass of all the elements (choices)
    def __init__(self, name):
        self.name = name
    def getName(self):
        return self.name
    def compareTo(self, p2):
        raise NotImplementedError("Not yet implemented")

class Rock(Element):    #Rock choice
    def compareTo(self, p2):
        global ties
        global p1Wins
        global p2Wins

        if (p2 == "Rock"):
            ties = ties + 1
            return " Rock equals Rock\n  Tie"
        elif (p2 == "Paper"):
            p2Wins = p2Wins + 1
            return " Paper covers Rock\n   Player 2 wins"
        elif (p2 == "Scissors"):
            p1Wins = p1Wins + 1
            return " Rock crushes Scissors\n  Player 1 wins"
        elif (p2 == "Lizard"):
            p1Wins = p1Wins + 1
            return " Rock crushes Lizard\n  Player 1 wins"
        elif (p2 == "Spock"):
            p2Wins = p2Wins + 1
            return " Spock vaporizes Rock\n  Player 2 wins"

class Paper(Element):    #Paper choice
    def compareTo(self, p2):
        global ties
        global p1Wins
        global p2Wins

        if (p2 == "Rock"):
                p1Wins = p1Wins + 1
                return " Paper covers Rock\n  Player 1 wins"
        elif (p2 == "Paper"):
                ties = ties + 1
                return " Paper equals Paper\n   tie"
        elif (p2 == "Scissors"):
                p2Wins = p2Wins + 1
                return " Scissors cut Paper\n  Player 2 wins"
        elif (p2 == "Lizard"):
                p2Wins = p2Wins + 1
                return " Lizard eats Paper\n  Player 2 wins"
        else:
                p1Wins = p1Wins + 1
                return " Paper disproves Spock\n  Player 1 wins"
    
class Scissors(Element):    #Scissors choice
    def compareTo(self, p2):
        global ties
        global p1Wins
        global p2Wins

        if (p2 == "Rock"):
            p2Wins = p2Wins + 1
            return " Rock crushes Scissors\n  Player 2 wins"
        elif (p2 == "Paper"):
            p1Wins = p1Wins + 1
            return " Scissors cut Paper\n   Player 1 wins"
        elif (p2 == "Scissors"):
            ties = ties + 1
            return " Scissors equal Scissors\n  tie"
        elif (p2 == "Lizard"):
            p1Wins = p1Wins + 1
            return " Scissors decapitate Lizard\n  Player 1 wins"
        else:
            p2Wins = p2Wins + 1
            return " Spock smashes Scissors\n  Player 2 wins"

class Lizard(Element):    #Lizard choice
    def compareTo(self, p2):
        global ties
        global p1Wins
        global p2Wins
            
        if (p2 == "Rock"):
            p2Wins = p2Wins + 1
            return " Rock crushes Lizard\n  Player 2 wins"
        elif (p2 == "Paper"):
            p1Wins = p1Wins + 1
            return " Lizard eats Paper\n   Player 1 wins"
        elif (p2 == "Scissors"):
            p2Wins = p2Wins + 1
            return " Scissors decapitate Lizard\n  Player 2 wins"
        elif (p2 == "Lizard"):
            ties = ties + 1
            return " Lizard equals Lizard\n  Tie"
        else:
            p1Wins = p1Wins + 1
            return " Lizard poisons Spock\n  Player 1 wins"

class Spock(Element):    #Spock choice
    def compareTo(self, p2):
        global ties
        global p1Wins
        global p2Wins

        if (p2 == "Rock"):
            p1Wins = p1Wins + 1
            return " Spock vaporizes Rock\n  Player 1 wins"
        elif (p2 == "Paper"):
            p2Wins = p2Wins + 1
            return " Paper disproves Spock\n   Player 2 wins"
        elif (p2 == "Scissors"):
            p1Wins = p1Wins + 1
            return " Spock smashes Scissors\n  Player 1 wins"
        elif (p2 == "Lizard"):
            p2Wins = p2Wins + 1
            return " Lizard poisons Spock\n  Player 2 wins"
        else:
            ties = ties + 1
            return " Spock equals Spock\n  tie"

class Player:    #superclass of all the different types of players
    def __init__(self, name):
        self.name = name
    def getName(self):
        return self.name
    def play(self):
        raise NotImplementedError("Not yet implemented")

class StupidBot(Player):    #This bot will return Spock every time just like Sheldon plays all the time
    def play(self):
        return Spock('Spock')

class RandomBot(Player):    #This bot picks a random number from 1-5 and plays that move
    def play(self):
        randomChoice = random.randint(1,5)
        if randomChoice == 1:
            return Rock('Rock')
        elif randomChoice == 2:
            return Paper('Paper')
        elif randomChoice == 3:
            return Scissors('Scissors')
        elif randomChoice == 4:
            return Lizard('Lizard')
        else:
            return Spock('Spock')

class IterativeBot(Player):    #This bot cycles thru rock,paper,scissors,lizard,spock in that order
    def play(self):
        if currMove == 0:
            return Rock('Rock')
        elif currMove == 1:
            return Paper('Paper')
        elif currMove == 2:
            return Scissors('Scissors')
        elif currMove == 3:
            return Lizard('Lizard')
        else:
            return Spock('Spock')

class LastPlayBot1(Player):    #This bot will play player 2 last move except on turn 1 where is chooses a random choice
    def play(self):
        if currMove == 0:
            randomChoice = random.randint(1,5)
            if randomChoice == 1:
                return Rock('Rock')
            elif randomChoice == 2:
                return Paper('Paper')
            elif randomChoice == 3:
                return Scissors('Scissors')
            elif randomChoice == 4:
                return Lizard('Lizard')
            else:
                return Spock('Spock')
        elif currMove == 1:
            return p2Moves[0]
        elif currMove == 2:
            return p2Moves[1]
        elif currMove == 3:
            return p2Moves[2]
        else:
            return p2Moves[3]
        
class LastPlayBot2(Player):    #This bot will play player 1 last move except on turn 1 where is chooses a random choice
    def play(self):
        if currMove == 0:
            randomChoice = random.randint(1,5)
            if randomChoice == 1:
                return Rock('Rock')
            elif randomChoice == 2:
                return Paper('Paper')
            elif randomChoice == 3:
                return Scissors('Scissors')
            elif randomChoice == 4:
                return Lizard('Lizard')
            else:
                return Spock('Spock')
        elif currMove == 1:
            return p1Moves[0]
        elif currMove == 2:
            return p1Moves[1]
        elif currMove == 3:
            return p1Moves[2]
        else:
            return p1Moves[3]

class Human(Player):    #This isn't a bot. This is for if a human(s) wants to play
    def play(self):
        print "(1) : Rock"
        print "(2) : Paper"
        print "(3) : Scissors"
        print "(4) : Lizard"
        print "(5) : Spock"
        
        try:
            selection = int(raw_input("Please enter a number: "))
        except ValueError:
            print "Invalid Choise Please Try Again"
            self.play()
        else:
            if selection == 1:
                return Rock('Rock')
            elif selection == 2:
                return Paper('Paper')
            elif selection == 3:
                return Scissors('Scissors')
            elif selection == 4:
                return Lizard('Lizard')
            elif selection == 5:
                return Spock('Spock')
            else:
                print "Invalid Choise Please Try Again"
                self.play()

class MyBot(Player):    #This bot is my own creation and it makes it so the game is always a tie
    def play(self):
        global isP1Mybot
        if isP1Mybot:
            return p2Moves[currMove]
        else:
            return p1Moves[currMove]

class Main:    #main class that controls and runs the program
    def __init__(self):
        print "Welcome to Rock, Paper, Scissors, Lizard, Spock"
        print "Created by Jeremiah Locke"
        print ""
        print "Please begin by picking 2 players from the list below "
        print " 1: Human Player"
        print " 2: Random Bot"
        print " 3: Stupid Bot"
        print " 4: Iterative Bot"
        print " 5: Last Play Bot"
        print " 6: MyBot(WARNING!! both P1 and P2 can NOT be MyBot)"
        print ""
        self.player1Selected()
        self.player2Selected()
        print ""
        print "%s vs. %s: BEGIN!\n" % (p1.getName(), p2.getName())
        for i in range(0, 5): #for loop for game
            global p1Moves
            global p2Moves
            global currMove
            global isP1Mybot
            print "Round",(i+1),"of 5"
            if isP1Mybot:
                p2move = p2.play()
                p2Moves[currMove] = p2move
                p1move = p1.play()
                p1Moves[currMove] = p1move
                print "    Player 1 Chooses: %s" % (p1move.getName())
                print "    Player 2 Chooses: %s" % (p2move.getName())
            else:
                p1move = p1.play()
                p1Moves[currMove] = p1move
                print "    Player 1 Chooses: %s" % (p1move.getName())
                p2move = p2.play()
                p2Moves[currMove] = p2move
                print "    Player 2 Chooses: %s" % (p2move.getName())
            print p1move.compareTo(p2move.getName())
            print ""
            currMove = currMove + 1
        print "The score is ",p1Wins," to ",p2Wins," with ",ties," ties"
        if p1Wins > p2Wins:
            print "%s has defeated %s" % (p1.getName(), p2.getName())
        elif p1Wins < p2Wins:
            print "%s has defeated %s" % (p2.getName(), p1.getName())
        else:
            print "The Game is a Tie"
       
    def player1Selected(self): #selects player 1 based on input
        try:
            selection = int(raw_input("Select Player 1: "))
        except ValueError:
            print "Invalid Choise Please Try Again"
            self.player1Selected()
        else:
            global p1
            global isP1Mybot
            if selection == 1:
                p1 = Human(self.nameSelect(1))
            elif selection == 2:
                p1 = RandomBot('RandomBot')
            elif selection == 3:
                p1 = StupidBot('StupidBot')
            elif selection == 4:
                p1 = IterativeBot('IterativeBot')
            elif selection == 5:
                p1 = LastPlayBot1('LastPlayBot1')
            elif selection == 6:
                isP1Mybot = True
                p1 = MyBot('MyBot')
            else:
                print "Invalid Choise Please Try Again"
                self.player1Selected()
    def player2Selected(self): #selects player 2 based on input
        try:
            selection = int(raw_input("Select Player 2: "))
        except ValueError:
            print "Invalid Choise Please Try Again"
            self.player2Selected()
        else:
            global p2
            if selection == 1:
                p2 = Human(self.nameSelect(2))
            elif selection == 2:
                p2 = RandomBot('RandomBot')
            elif selection == 3:
                p2 = StupidBot('StupidBot')
            elif selection == 4:
                p2 = IterativeBot('IterativeBot')
            elif selection == 5:
                p2 = LastPlayBot2('LastPlayBot2')
            elif selection == 6:
                p2 = MyBot('MyBot')
            else:
                print "Invalid Choise Please Try Again"
                self.player2Selected()
    def nameSelect(self, playerNumber): #allows a player to pick a human name
        selection = raw_input("Please Type A Name For Player %s " % (playerNumber))
        return selection
        
if __name__ == "__main__":
    Main()
