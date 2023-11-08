import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class WordFrequencyCounter {
	public static void main(String[] args) {
		String fileName = "input.txt";
		CustomHashTable hashTable = new CustomHashTable(10);
		try {
			BufferedReader reader = new BufferedReader(new
			FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				
			for (String word : words) {
				word = word.toLowerCase();
				hashTable.incrementFrequency(word);
			}
			}
		reader.close();		
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Print the contents of the hash table
		System.out.println("Word Frequencies:");
		hashTable.printFrequenciesDescending();
	}
}

class CustomHashTable {
	private LinkedList<WordFrequency>[] table;
	
	public CustomHashTable(int size) {
		table = new LinkedList[size];
		
		for (int i = 0; i < size; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	public void incrementFrequency(String word) {
		// TODO: Implement this method
		int index = hash(word);
        LinkedList<WordFrequency> list = table[index];
        for (WordFrequency wf : list) {
            if (wf.word.equals(word)) {
                wf.incrementFrequency();
                return;
            }
        }
        list.add(new WordFrequency(word));
	}
	public void printFrequenciesDescending() {
		// TODO: Implement this method
        LinkedList<WordFrequency> frequencies = new LinkedList<>();
        for (LinkedList<WordFrequency> list : table) {
            for (WordFrequency wf : list) {
                frequencies.add(wf);
            }
        }
		Collections.sort(frequencies, new Comparator<WordFrequency>() {
			public int compare(WordFrequency wf1, WordFrequency wf2) {
				return Integer.compare(wf2.frequency, wf1.frequency);
			}
		});
        for (WordFrequency wf : frequencies) {
            System.out.println(wf);
        }	
	}
	private int hash(String key) {
		// TODO: Implement a more effective hash function
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * 31 + key.charAt(i)) % table.length;
        }
        return hash;
	}
}

class WordFrequency {
	String word;
	int frequency;
	
	public WordFrequency(String word) {
		this.word = word;
		this.frequency = 1;
	}
	
	public void incrementFrequency() {
		frequency++;
	}
	
	public String toString() {
		return word + ": " + frequency;
	}
}