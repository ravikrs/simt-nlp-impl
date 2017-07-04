package de.rwth.i9.simt.nlp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopWordsEn {
	private static final Logger log = LoggerFactory.getLogger(StopWordsEn.class);
	private static final String EN_STOPWORDS_FILE = "/stopwords/en/StopWordsEn.txt";
	private static Set<String> stopWords;

	private static void loadStopWords() {
		if (stopWords == null) {
			stopWords = new HashSet<String>();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(StopWordsEn.class.getResourceAsStream(EN_STOPWORDS_FILE)));
			String word;
			try {
				while ((word = br.readLine()) != null) {
					stopWords.add(word);
				}
				br.close();
			} catch (IOException e) {
				log.error(e.getMessage());
			}
		}
	}

	public static boolean isStopWord(String word) {
		if (stopWords == null) {
			loadStopWords();
		}
		return stopWords.contains(word.trim().toLowerCase());
	}
}
