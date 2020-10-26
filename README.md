# ActivityResultSample
Sample android app to show new Results API usage
Find more detailed documentation at [hackernoon]


# Sample Code 
```kotlin
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
       

  //To launch next activity
   next_activity_btn.setOnClickListener {
            openPostActivity.launch(
                Intent(this, SecondActivity::class.java).apply {
                    putExtra(ID, 1)
                }
            )
        }

    //Returning to parent activity is same as before
      cancel_button.setOnClickListener {
                setResult(Activity.RESULT_CANCELED)
                finish()
            }
    
            ok_btn.setOnClickListener {
                setResult(Activity.RESULT_OK)
                finish()
            }
```



