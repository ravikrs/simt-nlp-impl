package de.rwth.i9.cimt.nlp.opennlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.rwth.i9.cimt.nlp.NLP;

/**
 * factory class which returns nlp implementations such as openNLP, etc.
 * 
 * @author singh
 *
 */
@Component
public class NlpImplFactory {
	@Autowired
	private NLP openNLPImpl;

	/**
	 * returns an NLP implementation object to be used for performing NLP tasks
	 * 
	 * @param nlpImplName
	 * @return
	 */
	public NLP getNlpImplementation(String nlpImplName) {
		if ("openNLP".equalsIgnoreCase(nlpImplName)) {
			return openNLPImpl;
		}
		return null;
	}

}
