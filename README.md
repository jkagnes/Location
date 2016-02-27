# Location
This Project get the geo-location of the device by displaying the longitude and latitude.
The Project is built using the Service application component. 
A subclass 'Location Service' is created, which is triggered from the 'MainActivity' using Intent.
The data for latitude and longitude is fetched using ArrayList and displayed in the Physical device.
The manifest file is updated with <service /> element to refer the 'LocationService' subclass.
The layout file is created with 3 buttons 'Start', 'Stop' and 'Location' and a Textview element to display the latitude and longitude.
When the 'Start' button clicked the Service gets started in the background.
When the 'Location' button clicked the data gets displayed in the textview in the physical device.
When the 'Stop' button clicked the service is stopped.
