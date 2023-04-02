package com.dgnklz.talentsourcingsystem.business.constants;

public class ValidationMessages {
    public static class Candidate {
        public static final String NameSize = "Size must be between 3-20";
        public static final String ContactInformationSize = "Size must be between 1-50";
        public static final String PreviousInteractionIdValue = "1 for Phone, 2 for Mail";
        public static final String StatusIdValue = "1 for sourced, 2 for interviewing, 3 for offer sent, 4 for hired";
    }

    public static class CandidateInteraction {
        public static final String TypeValue = "1 for phone, 2 for mail";
        public static final String ContentSize = "Size must be between 1-50";

        public static final String Responded = "True or False";
        public static final String CandidateIdValueSize = "It must be min 1";
    }
}