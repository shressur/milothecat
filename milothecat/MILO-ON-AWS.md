<h5>Deploying Spring Boot App on AWS (Elastic Beanstalk)</h5>
<ul>
    <li>Create a Spring Boot Application with REST endpoints first</li>
    <li>
        Configure application port to listen to port: 5000<br>
        <code>
            pom.xml:<br>
            server.port=5000
        </code>
    </li>
    <li>
        Give your app a name (optional)<br>
        <code>
            &lt;build&gt;&nbsp;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;...&nbsp;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;&lt;finalName&gt;your-app-name&lt;/finalName&gt;<br>
                &nbsp;&nbsp;&nbsp;&nbsp;...&nbsp;<br>
            &nbsp;&nbsp;&lt;/build&gt;
        </code>
    </li>
    <li>Run Maven > "package" command (IntellijIDEA: Maven pan/window &gt; Choose "package" &gt; Click "play" button)<br>
        This will crete a your-app-name.jar under "target" directory
    </li>
    <li>Login into AWS Console
        <ul>
            <li>Click on Services (or search for Elastic Beanstalk)</li>
            <li>Compute > Elastic Beanstalk</li>
            <li>Create new application</li>
            <li>Go through the process (give the app a name, choose Java version, version label name</li>
            <li>Create (instant deployment)</li>
            <li>Browse and upload your-app-name.jar</li>
            <li>Deploy</li>
        </ul>
    </li>
</ul>
<h5>That's it!</h5>