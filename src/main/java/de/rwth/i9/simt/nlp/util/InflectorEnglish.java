package de.rwth.i9.simt.nlp.util;

import org.atteo.evo.inflector.English;

public class InflectorEnglish {
	public String getPlural(String tokenWord) {
		return English.plural(tokenWord);
	}

}
