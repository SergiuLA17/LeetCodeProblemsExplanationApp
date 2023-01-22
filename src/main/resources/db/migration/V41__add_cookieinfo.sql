CREATE TABLE `LearnJavaDB`.`cookieinfo.`
(
    `id`          INT  NOT NULL AUTO_INCREMENT,
    `title`       text NULL,
    `description` text NULL,
    PRIMARY KEY (`id`)
);


INSERT INTO `LearnJavaDB`.`cookieinfo.` (`title`, `description`)
VALUES ('Cookie',
        '
Cookie sunt date care se stocheaza pe dispozitibul clientului ca calculator sau telefon mobil, atunci
cand utilizatorul vizireaza aplicatia web. Aceste date sunt folosite pentru a retine informatii despre
despre utilizator, cum ar fi preferintele acestuia, datele de logare, si alte setari.
');

INSERT INTO `LearnJavaDB`.`cookieinfo.` (`title`, `description`)
VALUES ('Crearea cookie-urilor',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-java"><span class="hljs-type">Cookie</span> <span class="hljs-variable">myCookie</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">Cookie</span>(<span class="hljs-string">"username"</span>, <span class="hljs-string">"JohnDoe"</span>);
</code>
</pre2>
    </div>
    </div>

');

INSERT INTO `LearnJavaDB`.`cookieinfo.` (`title`, `description`)
VALUES ('Crearea cookie-urilor',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-scss">response<span class="hljs-selector-class">.addCookie</span>(myCookie);
</code>
</pre2>
    </div>
    </div>

');

INSERT INTO `LearnJavaDB`.`cookieinfo.` (`title`, `description`)
VALUES ('Crearea cookie-urilor',
        '
<div class="bg-black mb-4 rounded-md">
<div class="p-4 overflow-y-auto">
<pre2>
<code class="!whitespace-pre-wrap hljs language-scss">Cookie<span class="hljs-selector-attr">[]</span> cookies = request<span class="hljs-selector-class">.getCookies</span>();
for (Cookie c : cookies) {
    if (c.getName()<span class="hljs-selector-class">.equals</span>("username")) {
        String username = c<span class="hljs-selector-class">.getValue</span>();
    }
}
</code>
</pre2>
    </div>
    </div>

');


