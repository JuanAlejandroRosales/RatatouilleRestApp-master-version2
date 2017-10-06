package ratatouillerestapp.upc.edu.pe.ui.reservation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ratatouillerestapp.upc.edu.pe.R;
import ratatouillerestapp.upc.edu.pe.di.component.ActivityComponent;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseFragment;

/**
 * Created by Juan Alejandro on 6/10/2017.
 */

public class ReservationFragment extends BaseFragment implements ReservationMvpView {

    private TextView tvDisplayDate;
    private DatePicker dpResult;
    private Button btnChangeDate;

    private int year;
    private int month;
    private int day;

    static final int DATE_DIALOG_ID = 999;


    public static final String TAG = "ReservationFragment";


    @Inject
    ReservationMvpPresenter<ReservationMvpView, ReservationMvpInteractor> mPresenter;

    public static ReservationFragment newInstance() {
        Bundle args = new Bundle();
        ReservationFragment fragment = new ReservationFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reservation, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            mPresenter.onAttach(this);
        }

        return view;
    }

    @Override
    protected void setUp(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @OnClick(R.id.nav_back_btn)
    void onNavBackClick() {
        getBaseActivity().onFragmentDetached(TAG);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }



}

