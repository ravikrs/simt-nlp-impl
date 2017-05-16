package de.rwth.i9.cimt.nlp.opennlp;

import java.io.IOException;
import java.util.List;

import de.rwth.i9.cimt.nlp.NLP;
import opennlp.tools.parser.Parse;
import opennlp.tools.util.Span;

public interface OpenNLP extends NLP {
	/**
	 * Find named entities in a tokenized sentence.
	 * <p>
	 * Must call {@link #clearNamedEntityAdaptiveData()} after finding all named
	 * entities in a single document.
	 * </p>
	 *
	 *
	 * @param sentence
	 *            the sentence text
	 * @param tokens
	 *            the sentence tokens
	 * @return a collection of named entity references
	 */
	public List<Span> findNamedEntities(final String sentence, final String[] tokens);

	/**
	 * Find Discourse entities (entity mentions) in a document.
	 * 
	 * @param sentences
	 *            the document sentences
	 * @return the recognized discourse entities.
	 */
	// public DiscourseEntity[] findEntityMentions(final String[] sentences);

	/**
	 * Convert the provided sentence and corresponding tokens into a parse tree.
	 * 
	 * @param text
	 *            the sentence text
	 * @return the parse tree
	 */
	public Parse parseSentence(final String text);

	/**
	 * returns lemma of word based on a dictionary
	 * 
	 * @param word
	 * @param postag
	 * @return
	 * @throws IOException
	 */
	public String lemmatize(String word, String postag) throws IOException;

	/**
	 * returns ngrams from a list of sentence inputs
	 * 
	 * @param input
	 * @param n
	 * @param separator
	 * @return
	 */
	public List<String> ngram(List<String> input, int n, String separator);
}
