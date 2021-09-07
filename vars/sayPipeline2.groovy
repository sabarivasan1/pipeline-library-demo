
import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass
def call(Map params) {

			def sanityMap = input id: 'SanityId', message: 'Should we continue?', ok: 'Yes, we should.', submitter: 'Alice, Noob', parameters: [string(defaultValue: '',description: '', name: 'Username'), string(defaultValue: '', description: '', name: 'Password'), booleanParam(description: '', name: 'Remain'),choice(choices:'ONE\nTWO', description: '', name: 'Choosen')]
build(
									  job: 'ProjectF',
									  parameters: [
										[
										  $class: 'StringParameterValue',
										  name: 'STRING_PARAMETER',
										  value: "${sanityMap['Username']}",
										],
										[
										  $class: 'BooleanParameterValue',
										  name: 'BOOLEAN',
										  value: "${sanityMap['Remain']}",
										],
										[
										  $class: 'StringParameterValue',
										  name: 'PARAMETER_01',
										  value: "${sanityMap['Choosen']}",
										],
										[
										  $class: 'StringParameterValue',
										  name: 'MULTI_LINE_STRING',
										  value: "${sanityMap['Username']}, ${sanityMap['Password']}",
										],
									  ],
									)
								echo "Values trigger11: ${sanityMap['Username']}, ${sanityMap['Password']}, ${sanityMap['Remain']}, ${sanityMap['Choosen']}"						
}
