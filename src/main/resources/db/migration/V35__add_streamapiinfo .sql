CREATE TABLE `LearnJavaDB`.`streamaapiinfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`streamaapiinfo` (`title`, `description`)
VALUES ('Stream API',
        '
Reprezinta un set de clase si interfete care ofera o modalitate de a lucra cu colectii de date.
Aceste operatii pot fi executate in paralel, fara a necesita sa scriem codul de paralelizare.
API-ul ofera operatii de filtrare, sortare, mapare, reducere, colectare, etc.

');

INSERT INTO `LearnJavaDB`.`streamaapiinfo` (`title`, `description`)
VALUES ('Exemplu de programare functionala',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.util.Arrays;
<span class="hljs-keyword">import</span> java.util.List;
<span class="hljs-keyword">import</span> java.util.stream.Stream;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">StreamExample</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        List&lt;Integer&gt; numbers = Arrays.asList(<span class="hljs-number">1</span>, <span class="hljs-number">2</span>, <span class="hljs-number">3</span>, <span class="hljs-number">4</span>, <span class="hljs-number">5</span>, <span class="hljs-number">6</span>, <span class="hljs-number">7</span>, <span class="hljs-number">8</span>, <span class="hljs-number">9</span>, <span class="hljs-number">10</span>);

        <span class="hljs-comment">// Using the filter method to filter out odd numbers</span>
        numbers.stream()
               .filter(n -&gt; n % <span class="hljs-number">2</span> == <span class="hljs-number">0</span>)
               .forEach(System.out::println);
    }
}
</code>
</pre2>
    </div>
    </div>
');


