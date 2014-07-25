&lt;html&gt;
    &lt;head&gt;
        &lt;title&gt;${title}&lt;/title&gt;
    &lt;/head&gt;
    &lt;body&gt;
        &lt;h1&gt;${project.name}&lt;/h1&gt;

        &lt;ul&gt;
        &lt;% project.properties.findAll { k,v -&gt; v instanceof String }.each { key, value -&gt; %&gt;
            &lt;li&gt;$key = $value&lt;/li&gt;
        &lt;% } %&gt;
        &lt;/ul&gt;

        &lt;hr /&gt;
        &lt;p&gt;Generated on ${generated.format('dd-MM-yyyy')}&lt;/p&gt;
    &lt;/body&gt;
&lt;/html&gt;
