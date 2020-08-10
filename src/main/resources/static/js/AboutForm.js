class AboutForm extends React.Component {
    constructor (props) {
        super(props);
    }

    render() {
         return (
            <div>
                <h2>The Tournament Marshal project</h2>
                <br/>
                <p> The Tournament Marshal project is my own personal project to showcase my software
                development skills, as well as implementing a piece of software to facilitate running miniature
                war games tournaments which is a hobby of mine.  To date, the project implements the following
                technology skills :</p>
                <ul>
                    <li>Spring Boot</li>
                    <li>Spring Security</li>
                    <li>Aspect oriented programming</li>
                    <li>Java</li>
                    <li>SQL Database</li>
                    <li>HTML</li>
                    <li>CSS</li>
                    <li>Javascript</li>
                    <li>ReactJs</li>
                    <li>Rest</li>
                    <li>Maven</li>
                    <li>Git</li>
                </ul>
                <br/>
                TODO list :
                <ul>
                    <li>Flyway needs to be properly configured.</li>
                    <li>Database.  Currently using H2 as an exercise, would prefer to use a real database, probably MySQL or Postgres.</li>
                    <li>Business logic.  Really not much is here, just a skeleton of a project.</li>
                    <li>Permissions. Virtually no permission related restrictions have been implemented.</li>
                </ul>
            </div>
         )
    }
}