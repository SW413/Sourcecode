/* Simple-OpenCL Hardware setup  */

	sclHard* allHardware;
	sclHard fastHardware;
	int found = 0;
	allHardware = sclGetAllHardware( &found );
	fastHardware = sclGetFastestDevice(allHardware, found);

/* END Hardware setup */