CREATE TABLE `LearnJavaDB`.`functionalprogramming`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`functionalprogramming` (`title`, `description`)
VALUES ('Functional programming',
        '
Programarea functionala este un stil de programamre unde metodele reprezinta obiecte,<br>
le putem transmite ca argumente si le putem returna ca rezultat.<br>
In java avem cateva instrumente pentru programamre functionala, cum ar fi:<br>
- Stream API<br>
- Lambda expressions<br>
- Method references<br>
- Functional interfaces<br>
- Optional<br>
- Collectors<br>
- Parallel streams<br>
- Default methods<br>
- Static methods<br>
- Predicates<br>
- Functions<br>
- Suppliers<br>
- Consumers<br>
- Comparators<br>
Exemplu de programare functionala:<br>

');

INSERT INTO `LearnJavaDB`.`functionalprogramming` (`title`, `description`)
VALUES ('Exemplu de programare functionala',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-scss">List&lt;Integer&gt; numbers = Arrays<span class="hljs-selector-class">.asList</span>(<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>, <span class="hljs-number">4</span>, <span class="hljs-number">5</span>);<br>
<br>
<span class="hljs-comment">// Folosim stream pentru filtrarea si maparea datelor</span><br>
List&lt;Integer&gt; evenSquares = numbers<span class="hljs-selector-class">.stream</span>()<br>
    <span class="hljs-selector-class">.filter</span>(n -&gt; n % <span class="hljs-number">2</span> == <span class="hljs-number">0</span>)    <span class="hljs-comment">// filter out odd numbers</span><br>
    <span class="hljs-selector-class">.map</span>(n -&gt; n * n)            <span class="hljs-comment">// square the remaining numbers</span><br>
    <span class="hljs-selector-class">.collect</span>(Collectors.toList());<br>
<br>
System<span class="hljs-selector-class">.out</span><span class="hljs-selector-class">.println</span>(evenSquares);  <span class="hljs-comment">// Output: [4, 16]</span><br>
</code><br>
    </div>
    </div>
');

INSERT INTO `LearnJavaDB`.`functionalprogramming` (`title`, `description`)
VALUES ('Exemplu de programare functionala prin lambda',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-vbnet"><span class="hljs-keyword">Optional</span>&lt;<span class="hljs-type">String</span>&gt; <span class="hljs-keyword">optional</span> = <span class="hljs-keyword">Optional</span>.ofNullable(<span class="hljs-string">"Hello"</span>);<br>
<span class="hljs-keyword">if</span>(<span class="hljs-keyword">optional</span>.isPresent())<br>
{<br>
  System.out.println(<span class="hljs-keyword">optional</span>.<span class="hljs-keyword">get</span>());<br>
}<br>
</code>
 </div>
');

INSERT INTO `LearnJavaDB`.`functionalprogramming` (`title`, `description`)
VALUES ('Exemplu de programare functionala prin lambda',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<code class="!whitespace-pre-wrap hljs language-scss">Thread t = new <span class="hljs-built_in">Thread</span>(()-&gt; <br>
System<span class="hljs-selector-class">.out</span><span class="hljs-selector-class">.println</span>("Hello World"));<br>
t<span class="hljs-selector-class">.start</span>();
</code>
 </div>
');


