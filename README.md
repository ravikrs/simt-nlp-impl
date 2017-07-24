# simt-nlp-impl
Semantic Interest Modelling Toolkit is developed for my master thesis at RWTH Aachen University titled "Leveraging knowledge-bases for effective interest mining in academic networks". 
This project is the NLP component of SIMT.

SIMT Natural Language Processing Implementation, or SIMT NLP Impl for short, is a java based library that can be used to perform 
various NLP tasks such as sentence detection, tokenization, parts of speech tagging, stemming, lemmatization, pluralization, etc. 

Please look at the Wiki pages for usage examples.

# Third party projects and libraries.
This implementation uses Apache OpenNLP (https://opennlp.apache.org/) for performing NLP tasks.

Stemming and Lemmatization is also based on Apache OpenNLP. Dictionary for lemmatization is used from link https://raw.githubusercontent.com/richardwilly98/elasticsearch-opennlp-auto-tagging/master/src/main/resources/models/en-lemmatizer.dict 
provided in https://github.com/richardwilly98/elasticsearch-opennlp-auto-tagging repository.

English pluralization is based on evo-inflector (https://github.com/atteo/evo-inflector).
