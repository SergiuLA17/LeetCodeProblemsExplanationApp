CREATE TABLE `LearnJavaDB`.`lambdainfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`lambdainfo` (`title`, `description`)
VALUES ('Functional programming',
        '
Lambda a aparut in Java 8, ele sunt o modalitatea de a crea functii anonime, adica fara a le declara in clasa. <br>
Aceste functii pot fi transmise ca argument sau pot fi returnate de alte functii.<br>
<br>
Lambda sunt o modalitate de a scrie cod mai scurt si mai usor de inteles.<br>
<br>
O expresie lambda are următoarea sintaxă:<br>
<br>
    (parametri) -> {bloc de cod}<br>
<br>
De exemplu, următoarea expresie lambda ia ca intrare două numere întregi și returnează suma lor:<br>
<br>
(int x, int y) -> x + y<br>
<br>
Expresiile Lambda pot fi folosite și cu interfețe funcționale, care sunt interfețe cu o singură metodă abstractă.<br>
De exemplu, interfața Comparator are o singură metodă abstractă, numită compare, care primește două obiecte și returnează un număr întreg.<br>

');

INSERT INTO `LearnJavaDB`.`lambdainfo` (`title`, `description`)
VALUES ('Exemplu de programare functionala',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class=" hljs language-typescript"><span class="hljs-keyword">import</span> java.<span class="hljs-property">util</span>.<span class="hljs-property">function</span>.<span class="hljs-property">Function</span>;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">Main</span> {
    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-built_in">void</span> <span class="hljs-title function_">main</span>(<span class="hljs-params"><span class="hljs-built_in">String</span>[] args</span>) {
        <span class="hljs-title class_">Function</span>&lt;<span class="hljs-title class_">Integer</span>, <span class="hljs-title class_">Integer</span>&gt; square = x -&gt; x * x;
        <span class="hljs-title class_">System</span>.<span class="hljs-property">out</span>.<span class="hljs-title function_">println</span>(square.<span class="hljs-title function_">apply</span>(<span class="hljs-number">5</span>)); <span class="hljs-comment">// Output: 25</span>
    }
}
</code>
</pre2>
    </div>
    </div>
');


