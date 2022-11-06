# file-upload-backend

<div class="semi-bold margin-bottom-20">Upload file to cloud</div><div class="file-problem complete-problem-statement black-333"><p style="line-height: 2.5919999999999996; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Build a pseudo backend API utility that uploads a PDF file to the cloud.</span></p>
<p style="line-height: 2.5919999999999996; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Tech stack</span></p>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 2.5919999999999996; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Frontend</span><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">: </span><span style="font-size: 11.5pt; font-family: Arial; color: rgb(29, 28, 29); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #d6d2cd;" data-darkreader-inline-color="">Angular 2+ or React JS</span><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">&nbsp;</span></p>
</li>
<li>
<p style="line-height: 2.5919999999999996; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Back end</span><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">: Java, SpringBoot/Hibernate</span></p>
</li>
</ul>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">[Minimum requirement]</span></p>
<p>&nbsp;</p>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Write an app in the tech stack mentioned which exposes an API that returns the necessary response.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Create RESTful APIs, </span><span style="font-size: 11.5pt; font-family: Arial; color: rgb(29, 28, 29); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #d6d2cd;" data-darkreader-inline-color="">use Spring Boot (MVC Architecture) for bean initialization and Service injection configuration.</span><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">&nbsp;</span></p>
</li>
</ul>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Frontend</span></p>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Make a simple form that takes in the file name and gives the option to upload a PDF file.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Test for the following validations:</span></p>
</li>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Max File Size: 1MB</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">File Type: .pdf</span></p>
</li>
</ul>
</ul>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Show a list of past uploaded files with links.</span></p>
</li>
</ul>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Back end</span></p>
<p>&nbsp;</p>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11.5pt; font-family: Arial; color: rgb(29, 28, 29); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #d6d2cd;" data-darkreader-inline-color="">Use service initialization/injection by Spring Boot configurations.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Create an API Utility that intakes the given file and uploads it to any cloud storage. Example S3 in AWS, Google Cloud Storage, or Azure Cloud Storage.</span></p>
</li>
</ul>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Rename the PDF file to the given name and add a 7-digit Hash.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">The Hash must never repeat</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">MimeType: content/pdf</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Make sure that the browser does not download the PDF file but only shows it, unlike the link in the guide.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Test for the following validations:</span></p>
</li>
<ul style="margin-top: 0; margin-bottom: 0;">
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Max File Size: 1MB</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">File Type: .pdf</span></p>
</li>
</ul>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Map the name of the file with Name+Hash and store it in the database.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11.5pt; font-family: Arial; color: rgb(29, 28, 29); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #d6d2cd;" data-darkreader-inline-color="">Use Hibernate (ORM) or Spring data.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11.5pt; font-family: Arial; color: rgb(29, 28, 29); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #d6d2cd;" data-darkreader-inline-color="">Use JAVA 8 (or higher) features like Stream, Lambda Expressions, Concurrency API, etc.</span></p>
</li>
<li>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Create a 2nd API that sends a JSON containing a list of past uploaded file links</span></p>
</li>
</ul>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Deploy</span></p>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Deploy the app on any cloud service and share the link in a .txt file.</span></p>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: bold; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">[Guide]</span></p>
<p>&nbsp;</p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><span style="font-size: 11pt; font-family: Arial; color: rgb(0, 0, 0); font-weight: 400; font-style: normal; vertical-align: baseline; --darkreader-inline-color: #e8e6e3;" data-darkreader-inline-color="">Here is a Sample PDF hosted on S3:</span></p>
<p style="line-height: 1.38; margin-top: 0pt; margin-bottom: 0pt;"><a href="https://s3-ap-southeast-1.amazonaws.com/he-public-data/dummyc4d1859.pdf" target="_blank">https://s3-ap-southeast-1.amazonaws.com/he-public-data/dummyc4d1859.pdf</a></p>
<p>&nbsp;</p>
<p><strong>Upload ZIP File containing Source code and Deployed Link</strong></p></div><div class="clear"></div>