# ActivityResultSample
Sample android app to show new Results API usage

'''
 // General activity result contract
    private val openPostActivity =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Do something here
                val okDataIntent = result.data
                Toast.makeText(this, "Result OK from SecondActivity", Toast.LENGTH_SHORT).show()
            }
            if (result.resultCode == Activity.RESULT_CANCELED) {
                // Do something here
                val canceledDataIntent = result.data
                Toast.makeText(this, "Result Cancelled from SecondActivity", Toast.LENGTH_SHORT).show()
            }
        }
'''
