CREATE TABLE `LearnJavaDB`.`linkedlistinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `LearnJavaDB`.`linkedlistinfo` (`title`, `description`)
VALUES ('LinkedList',
        '
LinkedList este o colectie care stocheaza elementele in ordinea care au fost adaugate.
Structura acestei colettii este bazata pe o lista dublu inlantuita.
Adica fiecare elemet in afara de valoarea, are si un pointer catre urmatorul element din lista.
AStfel de structura are avantaj la inserare si stergere elementelor, dar creaza probleme la accesarea elementelor.
Acest tip de colectie poate stoca orice tip de elemente.
');

INSERT INTO `LearnJavaDB`.`linkedlistinfo` (`title`, `description`)
VALUES ('Exemplu',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.util.LinkedList;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">LinkedListExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-comment">// Create a new LinkedList</span>
        LinkedList&lt;String&gt; list = <span class="hljs-keyword">new</span> <span class="hljs-title class_">LinkedList</span>&lt;&gt;();

        <span class="hljs-comment">// Add elements to the list</span>
        list.add(<span class="hljs-string">"Apple"</span>);
        list.add(<span class="hljs-string">"Banana"</span>);
        list.add(<span class="hljs-string">"Cherry"</span>);

        <span class="hljs-comment">// Print the list</span>
        System.out.println(<span class="hljs-string">"List: "</span> + list);

        <span class="hljs-comment">// Add an element at a specific position</span>
        list.add(<span class="hljs-number">1</span>, <span class="hljs-string">"Blueberry"</span>);
        System.out.println(<span class="hljs-string">"List after adding Blueberry: "</span> + list);

        <span class="hljs-comment">// Remove an element</span>
        list.remove(<span class="hljs-string">"Banana"</span>);
        System.out.println(<span class="hljs-string">"List after removing Banana: "</span> + list);

        <span class="hljs-comment">// Get the first and last elements</span>
        System.out.println(<span class="hljs-string">"First element: "</span> + list.getFirst());
        System.out.println(<span class="hljs-string">"Last element: "</span> + list.getLast());
    }
}
</code>
Output:
<code class="!whitespace-pre-wrap hljs language-yaml"><span class="hljs-attr">List:</span> [<span class="hljs-string">Apple</span>, <span class="hljs-string">Banana</span>, <span class="hljs-string">Cherry</span>]
<span class="hljs-attr">List after adding Blueberry:</span> [<span class="hljs-string">Apple</span>, <span class="hljs-string">Blueberry</span>, <span class="hljs-string">Banana</span>, <span class="hljs-string">Cherry</span>]
<span class="hljs-attr">List after removing Banana:</span> [<span class="hljs-string">Apple</span>, <span class="hljs-string">Blueberry</span>, <span class="hljs-string">Cherry</span>]
<span class="hljs-attr">First element:</span> <span class="hljs-string">Apple</span>
<span class="hljs-attr">Last element:</span> <span class="hljs-string">Cherry</span>
</code>
</pre2>
    </div>
    </div>');