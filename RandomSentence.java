//Random Sentence Generator
//3/15/2021
//By SirAwesomeness41

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RandomSentence {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many random sentences?");
		int howMany = sc.nextInt(); //The user inputs a positive integer.
		if(howMany <= 0) { //This will catch any input less than one.
			System.out.println("Enter a POSITIVE non-zero number.");
		}
		int i = 0;
		int j = 1;
		String[] sentences = new String[howMany]; //Constructing the array with the sentences.
		while(!(i >= howMany)) { //This loop will create the number of requested sentences.
			sentences[i] = looper();
			i++;
		}
		String string = sentences[0];
		PrintWriter file = new PrintWriter("random.txt");
		file.print(string);
		while(!(j >= howMany-1)) { //This loop inputs each sentence into a text file
			string = sentences[j];
			file.println(string);
			j++;
		}
		string = sentences[j];
		file.print(string); //This is done this way to prevent a blank line at the bottom of the txt file.
		file.close();
		System.out.println("Saved to random.txt");
	}
	public static String looper() throws FileNotFoundException, InterruptedException {
		int noun = 0;
		int verb = 0;
		int adjective = 0;
		int lyAdverb = 0;
		int ingVerb = 0;
		int pronoun = 0;
		int verb2 = 0;
		int noun2 = 0;
		//The nouns
		String[] nounList = {"book", "city", "person", "cow", "wolf", "dog", "fox", "computer", "word",
				"phone", "paper", "school", "hospital", "university", "police station", "box", "wire",
				"electricity", "mouse", "newspaper", "dragon", "cat", "beaver", "laptop", "bicycle",
				"monitor", "monitor lizard", "headphones", "money", "clock", "pistol", "blunderbuss",
				"sentence", "essay", "paragraph", "keyboard", "folder", "computer mouse", "blender",
				"compiler", "bridge", "house", "store", "factory", "office", "farm", "sword", "axe",
				"spear", "shield"};
		//The verbs
		String[] verbList = {"walks", "runs", "jumps", "sings", "dances", "flies", "finds", "clears",
				"loops", "builds", "is liberated", "plays", "is attacked", "attacks", "liberates",
				"heats up", "boils", "cooks", "is cooked", "stares", "gets takeout", "orders pizza",
				"robs a bank", "steals from a store", "grifts", "grafts", "jokes", "destroys", "smiles",
				"spots", "shifts", "legislates", "opens a window", "opens a door", "closes a window",
				"closes a door", "frowns", "drives", "looks at a calendar", "looks at their neighbor",
				"reads", "writes", "publishes a book", "opens a store", "creates a painting", "gets smaller",
				"grows larger", "screams", "discovers something", "projects"};
		//The adjectives
		String[] adjList = {"red", "yellow", "green", "blue", "purple", "orange", "tiny", "small", "midsize",
				"large", "enormous", "fancy", "expensive", "cheap", "gaudy", "drab", "boring", "fun",
				"interesting", "strange", "normal", "real", "fake", "fictional", "hard", "soft", "high",
				"low", "medium", "bronze", "silver", "gold", "platinum", "basic", "premium", "luxury",
				"northern", "southern", "eastern", "western", "American", "European", "Asian", "global",
				"hot", "lukewarm", "cold", "icy", "warm", "random"};
		//The -ly adverbs
		String[] lyAdverbList = {"abruptly", "angrily", "bashfully", "beautifully", "brazenly", "boldly",
				"calmly", "cheaply", "reassuringly", "carelessly", "adversely", "amazingly", "commonly",
				"coolly", "crossly", "dearly", "delightfully", "doggedly", "energetically", "especially",
				"exactly", "expertly", "fairly", "ferociously", "generally", "greedily", "gently",
				"generously", "heartily", "helplessly", "immediately", "innocently", "jokingly", "knowingly",
				"lightly", "loudly", "meaningfully", "mentally", "neatly", "nervously", "outwardly",
				"passionately", "playfully", "queerly", "rapidly", "scarcely", "truthfully",
				"understandingly", "viciously", "wholly"};
		//The -ing verbs
		String[] ingVerbList = {"singing", "playing", "barking", "learning", "watching", "sleeping",
				"drawing", "sitting", "swimming", "getting", "running", "stopping", "spelling", "putting",
				"cutting", "dancing", "writing", "legislating", "speeding", "staring", "looking", "joking",
				"swearing", "growing", "creating", "shrinking", "destroying", "building", "looping",
				"boiling", "walking", "running", "working", "frowning", "smiling", "liberating", "grifting",
				"grafting", "shifting", "spotting", "publishing", "opening", "closing", "shouting",
				"winning", "losing", "trying", "failing", "crying", "feeding"};
		//The pronouns
		String[] pronounList = {"he", "she", "it", "they", "we"};
		//The word randomizer; uses the array length to make expanding the arrays easier.
		noun = (int) Math.round((Math.random()*nounList.length)-1);
		verb = (int) Math.round((Math.random()*verbList.length)-1);
		adjective = (int) Math.round((Math.random()*adjList.length)-1);
		lyAdverb = (int) Math.round((Math.random()*lyAdverbList.length)-1);
		ingVerb = (int) Math.round((Math.random()*verbList.length)-1);
		pronoun = (int) Math.round((Math.random()*pronounList.length)-1);
		verb2 = (int) Math.round((Math.random()*verbList.length)-1);
		noun2 = (int) Math.round((Math.random()*nounList.length)-1);
		//How the program ensures that the random number is not below zero.
		if(noun == -1) {
			noun++;
		}
		if(verb == -1) {
			verb++;
		}
		if(adjective == -1) {
			adjective++;
		}
		if(lyAdverb == -1) {
			lyAdverb++;
		}
		if(ingVerb == -1) {
			ingVerb++;
		}
		if(pronoun == -1) {
			pronoun++;
		}
		if(verb2 == -1) {
			verb2++;
		}
		if(noun2 == -1) {
			noun2++;
		}
		System.out.println("The " + adjList[adjective] + " " + nounList[noun] + " " + verbList[verb] + 
				" after " + pronounList[pronoun] + " " + lyAdverbList[lyAdverb] + " " + verbList[verb2]
				+ " while the " + nounList[noun2] + " is " + ingVerbList[ingVerb] + ".");
		//Above displays the sentence, below returns it.
		return "The " + adjList[adjective] + " " + nounList[noun] + " " + verbList[verb] + 
				" after " + pronounList[pronoun] + " " + lyAdverbList[lyAdverb] + " " + verbList[verb2]
				+ " while the " + nounList[noun2] + " is " + ingVerbList[ingVerb] + ".";
	}
}
