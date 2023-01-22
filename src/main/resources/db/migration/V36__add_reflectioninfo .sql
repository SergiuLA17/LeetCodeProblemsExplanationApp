CREATE TABLE `LearnJavaDB`.`reflectioninfo`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);




INSERT INTO `LearnJavaDB`.`reflectioninfo` (`title`, `description`)
VALUES ('Reflection',
        '
Reflectia in Java este o tehnica prin care o clasa poate accesa informatii despre ea insasi, cum ar fi numele clasei, constructorii, metodele si campurile.
In plus, o clasa poate accesa informatii despre alte clase, cum ar fi numele clasei, constructorii, metodele si campurile.
Aceasta tehnica este foarte utila cand dorim sa cream aplicatii care sa fie extensibile, cum ar fi un framework de testare automatizat.
In plus, reflectia este folosita si in alte scopuri, cum ar fi: serializarea, deserializarea, proxy, etc.

');

INSERT INTO `LearnJavaDB`.`reflectioninfo` (`title`, `description`)
VALUES ('Exemplu de programare functionala',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-keyword">import</span> java.lang.reflect.Field;

<span class="hljs-keyword">public</span> <span class="hljs-keyword">class</span> <span class="hljs-title class_">ReflectExample</span> {
    <span class="hljs-keyword">private</span> String exampleField;

    <span class="hljs-keyword">public</span> <span class="hljs-keyword">static</span> <span class="hljs-keyword">void</span> <span class="hljs-title function_">main</span><span class="hljs-params">(String[] args)</span> {
        <span class="hljs-type">ReflectExample</span> <span class="hljs-variable">example</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">ReflectExample</span>();
        Class&lt;?&gt; cls = example.getClass();

        <span class="hljs-comment">// Get all fields of the class</span>
        Field[] fields = cls.getDeclaredFields();
        <span class="hljs-keyword">for</span> (Field field : fields) {
            System.out.println(<span class="hljs-string">"Field name: "</span> + field.getName());
            System.out.println(<span class="hljs-string">"Field type: "</span> + field.getType().getName());
        }
    }
}
</code>
</pre2>
    </div>
    </div>
');


