# Detect Program type using Bag of Words(BoW) Model

In this Project I have used the concept of Bag of Words to detremine the file/program type i.e whether the program is a Java program or Python Program. Currentlly the code is able to distinguish between only this 2 Program types. I am working to make it able to predict more program types.

[![Prediction Results](/images/prediction_results.png)]

Following are the modules used : 
en_core_web_sm

os

pandas as pd

random

string 

spacy

spacy.util.minibatch

re

# How it works :

## 1. Data Collection : 
  
  For the data collection I have downloaded sample programs for both the language type i.e. both java and Python programs
## 2. Data Processing : 
1. I have kept the above programs in respective folder type in sample files folder.
2. Iterate over the folders using os.walk and read the content of the files.
3. Call preprocess() function on our file content which will do the following task:
    a. Remove all the punctuations i.e. symbols like "-",",",".",etc.
    b. Remove all the stopwords like "a", "the", "is", "an", etc.
    c. Lemmatize the words i.e Convert running to run, walking to walk, etc.
    d. Return the cleaned words in form of a list.
4. Get all the file types present in our sample files and store them as a dictionary having two keys:
    a. The file type or file extensions which will act as our Labels.
    b. The cleaned content returned from our preproces() function.
5. We will the create a TextCategorizer with exclusive classes and "bow" architecture and add our labels to it.
6. Training our model with our sample file contents. We will use loop for more epochs, and re-shuffle the training data at the begining of each loop. Depending upon your computer;s performance it will take some time. Maybe even 30 minutes.
7. Predicting the file type of our test files. It contains 3 file types "ipynb", "py", and "java" file. 
8. Checking the results of our prediction.

# Best Part:

**The best part about this project is that the more the sample program types ypu will provide the more accurately it will be able to detect the file type. Also currently the sample files do not include .net program, ruby or other programs. Buit if you provide sample files for those languages also, it will be able to predict the file types for those languages. It's pretty dynamic.**
