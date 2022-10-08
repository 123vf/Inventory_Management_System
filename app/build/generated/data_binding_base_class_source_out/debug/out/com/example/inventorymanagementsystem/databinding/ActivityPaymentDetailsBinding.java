// Generated by view binder compiler. Do not edit!
package com.example.inventorymanagementsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.inventorymanagementsystem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPaymentDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rv4;

  private ActivityPaymentDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView rv4) {
    this.rootView = rootView;
    this.rv4 = rv4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPaymentDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPaymentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_payment_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPaymentDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv4;
      RecyclerView rv4 = ViewBindings.findChildViewById(rootView, id);
      if (rv4 == null) {
        break missingId;
      }

      return new ActivityPaymentDetailsBinding((ConstraintLayout) rootView, rv4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
