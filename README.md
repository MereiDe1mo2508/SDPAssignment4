What I did:
1) I made an interface to put any void function (you can make 1 or many void functions to give everyone their own job)
2) I made three subclasses that has their own job to do (for example one doing start thing, other executing thing, and third sending thing, etc.)
3) I made a facade class to simplify our code by putting all of our subclasses and their functions inside by new void function to execute everything(and you can also put any text if you want to)
4) I used client as main to execute the facade class only that will show all of your subclasses jobs(hence why facade is great pattern to execute command by using other class to put subclasses and functions)