
import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass
def call(Map params) {
pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello, world 1'
                sayHello 'Dave 1'

                echo 'The value of foo is : ' + GlobalVars.foo

                script {
                    def person = new SampleClass()
                    person.age = 21
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                    sayAge person.age
                }
            }
        }
    }
}
    pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello, world 1'
                sayHello 'Dave 1'

                echo 'The value of foo is : ' + GlobalVars.foo

                script {
                    def person = new SampleClass()
                    person.age = 21
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                    sayAge person.age
                }
            }
        }
    }
}
}
