package com.cardio_generator.outputs;

/**
 * Interface for outputting patient data.
 * Classes implementing this interface should provide an implementation
 * for outputting data with the given parameters.
 */
public interface OutputStrategy {
    /**
     * Outputs data for a patient.
     * 
     * @param patientId The ID of the patient
     * @param timestamp The timestamp at which the data is generated
     * @param label The label describing the type of data
     * @param data The actual data to output
     */
    void output(int patientId, long timestamp, String label, String data);
}
