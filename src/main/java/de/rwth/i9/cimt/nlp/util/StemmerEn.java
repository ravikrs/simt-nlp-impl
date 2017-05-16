package de.rwth.i9.cimt.nlp.util;

import opennlp.tools.stemmer.snowball.SnowballStemmer;
import opennlp.tools.stemmer.snowball.SnowballStemmer.ALGORITHM;

public class StemmerEn {
	private static SnowballStemmer stemmer = new SnowballStemmer(ALGORITHM.ENGLISH);

	public static String stemToken(String token) {
		return stemmer.stem(token).toString();
	}
}
