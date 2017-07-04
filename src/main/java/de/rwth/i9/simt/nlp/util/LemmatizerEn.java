package de.rwth.i9.simt.nlp.util;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import opennlp.tools.lemmatizer.SimpleLemmatizer;

public class LemmatizerEn {
	private static final Logger log = LoggerFactory.getLogger(LemmatizerEn.class);
	private static SimpleLemmatizer lemmatizer;
	private static final String MODEL_PATH = "/opennlp/model/en/";
	private static final String EN_LEMMATIZER_DICT = MODEL_PATH + "en-lemmatizer.dict";

	/**
	 * returns lemma of a word based on dictionary
	 * 
	 * @param word
	 * @param postag
	 * @return
	 * @throws IOException
	 */
	public static String lemmatize(String word, String postag) {
		if (lemmatizer == null) {
			try {
				InputStream is = LemmatizerEn.class.getResourceAsStream(EN_LEMMATIZER_DICT);
				lemmatizer = new SimpleLemmatizer(is);
				is.close();
			} catch (IOException e) {
				log.error(e.getMessage());
			}
		}
		if (lemmatizer != null) {
			return lemmatizer.lemmatize(word, postag);
		} else {
			return word;
		}
	}
}
