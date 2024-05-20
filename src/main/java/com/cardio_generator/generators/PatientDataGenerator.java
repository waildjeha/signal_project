package com.cardio_generator.generators;

import com.cardio_generator.outputs.OutputStrategy;

/**
 * Interface for generating patient data.
 * Classes implementing this interface should provide an implementation
 * for generating data for a patient with the given ID and output strategy.
 */
public interface PatientDataGenerator {
    /**
     * Generates data for a patient.
     * 
     * @param patientId The ID of the patient for whom to generate data
     * @param outputStrategyThe strategy used to output the generated data
     */
    void generate(int patientId, OutputStrategy outputStrategy);
}
