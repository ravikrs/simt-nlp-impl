package de.rwth.i9.simt.nlp;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;

public interface NLP {
	/**
	 * Read the content from the specified file and return a list of detected
	 * sentences.
	 * 
	 * @param file
	 *            the file to read
	 * @param cs
	 *            the file charset
	 * @return the detected sentences
	 * 
	 * @throws IOException
	 *             If an error occurs while loading the file
	 */
	public String[] detectSentences(final File file, final Charset cs) throws IOException;

	/**
	 * Break the given content/corpus into sentences.
	 * <p>
	 * The sentence detector is lazily initialized on first use.
	 * </p>
	 * 
	 * @param content
	 *            the text corpus
	 * @return the detected sentences in string array
	 */
	public String[] detectSentences(final String content);

	/**
	 * Tokenize the given sentence.
	 * <p>
	 * The tokenizer is lazily initialized on first use.
	 * </p>
	 * 
	 * @param sentence
	 *            a sentence to tokenize
	 * @return the individual tokens
	 */
	public String[] tokenize(final String sentence);

	/**
	 * Detect the part of speech tags for the given tokens in a sentence.
	 * <p>
	 * The tagger is lazily initialized on first use.
	 * </p>
	 * 
	 * @param tokens
	 *            an array of sentence tokens to tag
	 * @return the individual part-of-speech tags
	 */
	public String[] tagPartOfSpeech(final String[] tokens);

	/**
	 * 
	 * @param sentence
	 * @return
	 */
	public Set<String> nounPhraseExtractor(String sentence);
}
