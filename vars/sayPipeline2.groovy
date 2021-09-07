
import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass
def call(Map params) {

			def sanityMap = input id: 'SanityId', message: 'Should we continue?', ok: 'Yes, we should.', submitter: 'Alice, Noob', parameters: [string(defaultValue: '',description: '', name: 'Username'), string(defaultValue: '', description: '', name: 'Password'), booleanParam(description: '', name: 'Remain'),choice(choices:'ONE\nTWO', description: '', name: 'Choosen')]

}
