package com.seniordesign.theblueplug;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ApplianceDialogFragment extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.appliances_prompt)
               .setItems(R.array.appliances_array, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int which) {
                       // The 'which' argument contains the index position
                       // of the selected item
                	   // TODO Next step is to add the selected item to the appliances list and remove it from the dialog list
                   }
            });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
