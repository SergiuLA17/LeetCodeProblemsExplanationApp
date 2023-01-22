CREATE TABLE `LearnJavaDB`.`relationdatabase`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`relationdatabase` (`title`, `description`)
VALUES ('Relational database',
        '
Basa de date relationala este o baza de date care are o structura de date de tip tabel.
Unde o linie este un obiect si coloanele sunt atributele obiectului.
');

INSERT INTO `LearnJavaDB`.`reflectioninfo` (`title`, `description`)
VALUES ('Exemplu de programare functionala',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> com.mongodb.client.MongoClient;
<span class="hljs-keyword">import</span> com.mongodb.client.MongoClients;
<span class="hljs-keyword">import</span> com.mongodb.client.MongoCollection;
<span class="hljs-keyword">import</span> com.mongodb.client.MongoDatabase;
<span class="hljs-keyword">import</span> org.bson.Document;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">MongoDBExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-comment">// Connect to MongoDB</span>
        <span class="hljs-type">MongoClient</span> <span class="hljs-variable">mongoClient</span> <span class="hljs-operator">=</span> MongoClients.create(<span class="hljs-string">"mongodb://localhost:27017"</span>);

        <span class="hljs-comment">// Get a handle to the "test" database</span>
        <span class="hljs-type">MongoDatabase</span> <span class="hljs-variable">database</span> <span class="hljs-operator">=</span> mongoClient.getDatabase(<span class="hljs-string">"test"</span>);

        <span class="hljs-comment">// Get a handle to the "people" collection</span>
        MongoCollection&lt;Document&gt; collection = database.getCollection(<span class="hljs-string">"people"</span>);

        <span class="hljs-comment">// Insert a new document</span>
        <span class="hljs-type">Document</span> <span class="hljs-variable">person</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">Document</span>(<span class="hljs-string">"name"</span>, <span class="hljs-string">"John Doe"</span>)
                .append(<span class="hljs-string">"age"</span>, <span class="hljs-number">30</span>)
                .append(<span class="hljs-string">"address"</span>, <span class="hljs-keyword">new</span> <span class="hljs-title class_">Document</span>(<span class="hljs-string">"street"</span>, <span class="hljs-string">"123 Main St"</span>)
                .append(<span class="hljs-string">"city"</span>, <span class="hljs-string">"Anytown"</span>)
                .append(<span class="hljs-string">"state"</span>, <span class="hljs-string">"CA"</span>)
                .append(<span class="hljs-string">"zip"</span>, <span class="hljs-number">12345</span>));
        collection.insertOne(person);

        <span class="hljs-comment">// Find the first document in the collection</span>
        <span class="hljs-type">Document</span> <span class="hljs-variable">firstPerson</span> <span class="hljs-operator">=</span> collection.find().first();
        System.out.println(firstPerson.toJson());

        <span class="hljs-comment">// Close the MongoDB client</span>
        mongoClient.close();
    }
}
</code>
</pre2>
    </div>
    </div>
');


