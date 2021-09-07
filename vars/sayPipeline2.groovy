
import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass

pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello, world 2'
                sayHello 'Dave 2'

                echo 'The value of foo is : ' + GlobalVars.foo

                script {
                    def person = new SampleClass()
                    person.age = 43
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                    sayAge person.age
                }
            }
        }
    }
}
